require './app/mission_c_103.rb'

describe 'ロボット行動チェック' do
  describe '出力結果のテスト' do
    before { allow($stdout).to receive(:puts) }
    let(:missionC103) { MissionC103.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "6 2\n", "2 foo\n", "3 bar\n"
      expect { missionC103.run }.to output("1\nfoo\nbar\nfoo\n5\nfoo bar\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "12 5\n", "4 p\n", "2 i\n", "3 z\n", "4 z\n",
        "6 a\n"
      expect {
        missionC103.run }.to output("1\ni\nz\np i z\n5\ni z a\n7\np i z\nz\ni\n11\np i z z a\n"
        ).to_stdout
    end
  end
end
