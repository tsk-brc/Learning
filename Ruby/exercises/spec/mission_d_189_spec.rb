require './app/mission_d_189.rb'

describe 'アニバーサリーチェック' do
  describe '出力結果のテスト' do
    let(:missionD189) { MissionD189.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "1991\n", "2021\n"
      expect($stdout).to receive(:puts).with(30)
      missionD189.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "1983\n", "1984\n"
      expect($stdout).to receive(:puts).with(1)
      missionD189.run
    end
  end
end
