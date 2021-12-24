require './app/mission_c_083.rb'

describe 'グラフ作成チェック' do
  describe '出力結果のテスト' do
    let(:missionC083) { MissionC083.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "3 5\n",
      "5\n",
      "15\n",
      "10\n"
      expect { missionC083.run }.to output("1:*..\n2:***\n3:**.\n").to_stdout
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "4 2\n",
      "12\n",
      "8\n",
      "16\n",
      "10\n"
      expect {
 missionC083.run }.to output("1:******..\n2:****....\n3:********\n4:*****...\n").to_stdout
    end
  end
end
