require './app/mission_d_182.rb'

describe '燃費チェック' do
  describe '出力結果のテスト' do
    let(:missionD182) { MissionD182.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets).and_return "51\n", "2\n"
      expect($stdout).to receive(:puts).with(25)
      missionD182.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets).and_return "320\n", "16\n"
      expect($stdout).to receive(:puts).with(20)
      missionD182.run
    end
  end
end
